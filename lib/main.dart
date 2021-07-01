import 'package:firebase_core/firebase_core.dart';
import 'package:flutter/material.dart';
//nome projeto firebase: project-633980232301
import 'const.dart';
import 'login.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp();
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Articuno',
      theme: ThemeData(
        primaryColor: themeColor,
      ),
      home: LoginScreen(title: 'Articuno'),
      debugShowCheckedModeBanner: false,
    );
  }
}