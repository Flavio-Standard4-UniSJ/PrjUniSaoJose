
import 'package:flutter/material.dart';


class MyForm extends StatefulWidget {
  @override
  _MyFormState createState() => _MyFormState();
}

class _MyFormState extends State<MyForm> {
  final _formKey = GlobalKey<FormState>();
  TextEditingController _nameController;
  static List<String> listaTarefas = [null];

  @override
  void initState() {
    super.initState();
    _nameController = TextEditingController();
  }

  @override
  void dispose() {
    _nameController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.grey[200],
      appBar: AppBar(
        title: Row(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Image.asset('images/icone.png', fit: BoxFit.contain, height: 32,),
            Container(padding: const EdgeInsets.all(8.0), child: Text('Atlas')),
          ],
        ),
      ),
      body: Form(
        key: _formKey,
        child: Padding(
          padding: const EdgeInsets.all(16.0),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Padding(
                padding: const EdgeInsets.only(right: 32.0),
                child: TextFormField(
                  controller: _nameController,
                  decoration: InputDecoration(
                      hintText: 'Digite o nome do corretor'
                  ),
                  validator: (val){
                    if(val.trim().isEmpty) return 'Dados não informados';
                    return null;
                  },
                ),
              ),
              SizedBox(height: 20,),
              Text('Adicionar tarefas', style: TextStyle(fontWeight: FontWeight.w700, fontSize: 16),),
              ..._getTarefas(),
              SizedBox(height: 40,),
              FlatButton(
                onPressed: (){
                  if(_formKey.currentState.validate()){
                    _formKey.currentState.save();
                  }
                },
                child: Text('Registrar Tarefa'),
                color: Colors.green[800],
              ),

            ],
          ),
        ),
      ),

    );
  }

  List<Widget> _getTarefas(){
    List<Widget> tarefasTextFields = [];
    for(int i=0; i<listaTarefas.length; i++){
      tarefasTextFields.add(
          Padding(
            padding: const EdgeInsets.symmetric(vertical: 16.0),
            child: Row(
              children: [
                Expanded(child: TarefasTextFields(i)),
                SizedBox(width: 16,),
                //adicionar button na linha
                _addRemoveButton(i == listaTarefas.length-1, i),
              ],
            ),
          )
      );
    }
    return tarefasTextFields;
  }

  // add - remove
  Widget _addRemoveButton(bool add, int index){
    return InkWell(
      onTap: (){
        if(add){
          // adiciona campo nova tarefa
          listaTarefas.insert(0, null);
        }
        else listaTarefas.removeAt(index);
        setState((){});
      },
      child: Container(
        width: 30,
        height: 30,
        decoration: BoxDecoration(
          color: (add) ? Colors.green[800] : Colors.red,
          borderRadius: BorderRadius.circular(20),
        ),
        child: Icon((add) ? Icons.add : Icons.remove, color: Colors.white,),
      ),
    );
  }
}

class TarefasTextFields extends StatefulWidget {
  final int index;
  TarefasTextFields(this.index);
  @override
  _TarefasTextFieldsState createState() => _TarefasTextFieldsState();
}

class _TarefasTextFieldsState extends State<TarefasTextFields> {
  TextEditingController _nameController;

  @override
  void initState() {
    super.initState();
    _nameController = TextEditingController();
  }

  @override
  void dispose() {
    _nameController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {

    WidgetsBinding.instance.addPostFrameCallback((timeStamp) {
      _nameController.text = _MyFormState.listaTarefas[widget.index] ?? '';
    });

    return TextFormField(
      controller: _nameController,
      onChanged: (val) => _MyFormState.listaTarefas[widget.index] = val,
      decoration: InputDecoration(
          hintText: 'descrição da tarefa'
      ),
      validator: (val){
        if(val.trim().isEmpty) return 'Dados não informados';
        return null;
      },
    );
  }
}