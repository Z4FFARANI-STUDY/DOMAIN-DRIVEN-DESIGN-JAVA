// Animal é uma classe abstrata, pois representa um modelo a ser utilizado por outras subclasses
// NÃO PODEMOS INSTANCIAR OBJETOS DESTA CLASSE
public abstract class Animal {
    protected String nome;
    protected int numeroPatas;

    public abstract void som();
}