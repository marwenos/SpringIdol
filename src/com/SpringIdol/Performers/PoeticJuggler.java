package com.SpringIdol.Performers;

public class PoeticJuggler extends Juggler {
	private Poem poem ;

	public Poem getPoem() {
		return poem;
	}

	public void setPoem(Poem poem) {
		this.poem = poem;
	}

	public PoeticJuggler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PoeticJuggler(int beanBaggs , Poem poem) {
		super(beanBaggs);
		this.poem=poem;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void perform ()
	{
		super.perform();
		poem.recit();
	}
}
