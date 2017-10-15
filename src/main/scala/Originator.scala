trait Originator {
  def save(): Memento;
  def restore(m: Memento);
  def salario_$eq(salario:Double);
}