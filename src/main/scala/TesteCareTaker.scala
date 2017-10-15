class TesteCareTaker extends CareTaker{
  def addMemento(m: Memento) = {
    stack.push(m)
  }
  def getMemento(): Memento = {
    stack.pop();
  }

}