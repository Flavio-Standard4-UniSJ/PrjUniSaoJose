package controle;

import dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;

@WebServlet(name = "servUsuario", urlPatterns = {"/servUsuario"})
public class servUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            Usuario usu = new Usuario();
            String escolha = request.getParameter("botao");
            if(escolha.equals("Incluir")){
                try{
                    usu.setNome(request.getParameter("txtnome"));
                    usu.setLogin(request.getParameter("txtlogin"));
                    usu.setSenha(request.getParameter("txtsenha"));
                    UsuarioDAO usuarioDAO = new UsuarioDAO();
                    usuarioDAO.cadastrarUsuario(usu);
                    out.println("<body>");
                    out.println("<h2>"+usu.getNome()+" Cadastrado com sucesso!</h2>");
                    out.println("<h3><a href='index.html'>Retornar</a></h3>");
                    out.println("</body>");
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
            if(escolha.equals("Excluir")){
                try{
                    UsuarioDAO usuarioDAO = new UsuarioDAO();
                    usuarioDAO.excluirUsuario(request.getParameter("txtnome"));
                    out.println("<body>");
                    out.println("<h2>Registro excluido com sucesso!</h2>");
                    out.println("<h3><a href='index.html'>Retornar</a></h3>");
                    out.println("</body>");
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
              if(escolha.equals("Alterar")){
                try{
                    usu.setNome(request.getParameter("txtnome"));
                    usu.setLogin(request.getParameter("txtlogin"));
                    usu.setSenha(request.getParameter("txtsenha"));
                    UsuarioDAO usuarioDAO = new UsuarioDAO();
                    usuarioDAO.alterarUsuario(usu);
                    out.println("<body>");
                    out.println("<h2>Registro alterado com sucesso!</h2>");
                    out.println("<h3><a href='index.html'>Retornar</a></h3>");
                    out.println("</body>");
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
            if(escolha.equals("Consultar")){
                try{
                    UsuarioDAO usuarioDAO = new UsuarioDAO();
                    usu=usuarioDAO.consultarUsuarioNome(request.getParameter("txtnome"));
                    out.println("<body>");
                    out.println("<p>Nome selecionado " + usu.getNome() + "</p>");
                    out.println("<p>Login do usuário " + usu.getLogin() + "</p>");
                    out.println("<p>Senha do usuário " + usu.getSenha() + "</p>");
                    out.println("<h3><a href='index.html'>Retornar</a></h3>");
                    out.println("</body>");
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
            if(escolha.equals("Entrar")){
                try{
                    UsuarioDAO usuarioDAO = new UsuarioDAO();
                    usu=usuarioDAO.acessarContaUsuario(request.getParameter("txtlogin"),request.getParameter("txtsenha"));
                    out.println("<body>");
                    out.println("<p>Seja bem vindo " + usu.getNome() + "</p>");
                    out.println("<p>Login " + usu.getLogin() + "</p>");
                    out.println("<p>Senha " + usu.getSenha() + "</p>");
                    out.println("<h3><a href='index.html'>Retornar</a></h3>");
                    out.println("</body>");
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
