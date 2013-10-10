package com.SpringIdol.Performers;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.SpringIdol.contract.Performer;

public class Instrumentalist implements Performer
{
	public  Type_Singer type_singer ;
	private Map< String , Instrument>  instruments ;
	private Instrument main_instrument;
	
	public Instrumentalist() {
		super();
	}
	/*public Instrumentalist(Instrument main_instrument) {
		super();
		this.main_instrument=main_instrument;
	}*/
	public Instrumentalist(Map< String , Instrument>  instruments , Instrument main_instrument ) {
		super();
		this.instruments = instruments;
		this.main_instrument=main_instrument;
	}

	public Map< String , Instrument>  getInstruments() {
		return instruments;
	}

	public void setInstruments(Map< String , Instrument> instruments) {
		this.instruments = instruments;
	}
	
	public Type_Singer getType_singer() {
		return type_singer;
	}

	public void setType_singer(Type_Singer type_singer) {
		this.type_singer = type_singer;
	}
	
	public Instrument getMain_instrument() {
		return main_instrument;
	}
	@Qualifier ("main_instrument")
	@Autowired
	public void setMain_instrument(Instrument main_instrument) {
		this.main_instrument = main_instrument;
	}

	@Override
	public void perform  () {
		System.out.println("I am a : "+this.type_singer+" singer");
		 for (String key : instruments.keySet()) {
			 System.out.println(key +" : ");
			 instruments.get(key).play();
		
		}
		 System.out.println("My Main instrument : ");
		 main_instrument.play();
		}
	
}
