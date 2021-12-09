
package servico;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class ManipulaImagem {

    public static BufferedImage setImagemDimensao(String caminhoImage, Integer imgLargura, Integer imgAltura){
       
        Double novaImgLargura = null;
        Double novaImgAltura = null;
        Double imgProporcao = null;
        Graphics2D g2D = null;
        BufferedImage imagem = null, novaImagem = null;
        try{
           imagem = ImageIO.read(new File(caminhoImage));
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        novaImgAltura = (double) imagem.getHeight();
        novaImgLargura = (double) imagem.getWidth();
        if(novaImgLargura >= imgLargura){
            imgProporcao = (novaImgAltura / novaImgLargura);
            novaImgLargura = (double) imgLargura;
            novaImgAltura = (novaImgLargura * imgProporcao);
            
            while(novaImgAltura > imgAltura){
                novaImgLargura = (double) (--imgLargura);
                novaImgLargura = (novaImgAltura * imgProporcao);
            }
        }else if(novaImgAltura >= imgAltura){
            imgProporcao = (novaImgLargura / novaImgAltura);
            novaImgAltura = (double) imgAltura;
            while(novaImgLargura > imgLargura){
                novaImgAltura = (double) (--imgAltura);
                novaImgLargura = (novaImgAltura * imgProporcao);
            }
        }
        novaImagem = new BufferedImage(novaImgLargura.intValue(),novaImgAltura.intValue(), BufferedImage.TYPE_INT_RGB);
        g2D = novaImagem.createGraphics();
        g2D.drawImage(imagem, 0, 0, novaImgLargura.intValue(), novaImgLargura.intValue(), null);
        return novaImagem;
    }
    
    public static byte[] getImgBytes(BufferedImage image){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try{
            ImageIO.write(image, "JPEG", baos);
            
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        return baos.toByteArray();
    }
    
    public static void exigirImagemLabel(byte[] minhaImagem, javax.swing.JLabel label){
        if(minhaImagem != null){
            InputStream input = new ByteArrayInputStream(minhaImagem);
            try{
                BufferedImage imagem = ImageIO.read(input);
                label.setIcon(new ImageIcon(imagem));
            }catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }else{
            label.setIcon(null);
        }
    }
}



