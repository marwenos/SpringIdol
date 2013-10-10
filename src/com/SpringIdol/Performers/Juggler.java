package com.SpringIdol.Performers;

import com.SpringIdol.contract.Performer;

public class Juggler implements Performer {
	protected int beanBaggs =3 ;

	public Juggler(int beanBaggs) {
		super();
		this.beanBaggs = beanBaggs;
	}

	public Juggler() {
		super();
	}

	public int getBeanBaggs() {
		return beanBaggs;
	}

	public void setBeanBaggs(int beanBaggs) {
		this.beanBaggs = beanBaggs;
	}

	@Override
	public void perform() {
		System.out.println("JUGGLING "+beanBaggs+" BEANBAGS");
		
	}
	

}
