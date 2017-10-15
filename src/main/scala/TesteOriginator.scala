case class TesteOriginator(var salario:Double) extends Originator {
  def save():Memento={
    return new TesteMemento(this.salario);
  }
  def restore(m:Memento)={
    this.salario=m.salario();
  }
}