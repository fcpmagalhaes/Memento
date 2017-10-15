object Main extends App{
  val caretaker: CareTaker = new TesteCareTaker();
  val originator: Originator = new TesteOriginator(80000);

  originator.salario_=(85000)
  println("Salario 1: "+originator)
  caretaker.addMemento(originator.save())
  println("Salario 1 adicionado memento!")

  originator.salario_=(95000)
  println("Salario 2: "+originator)
  caretaker.addMemento(originator.save());
  println("Salario 2 adicionado memento!")

  originator.salario_=(98000)
  println("Salario 3: "+originator)


  println("Restaurando salário 2")
  originator.restore(caretaker.getMemento());
  println("Salario 2: "+originator)

  println("Restaurando salário 1")
  originator.restore(caretaker.getMemento());
  println("Salario 1: "+originator)


}
