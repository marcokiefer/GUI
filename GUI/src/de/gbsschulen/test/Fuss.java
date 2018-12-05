package de.gbsschulen.test;

public abstract class Fuss implements Koerper {
	private Integer anzahl = 2;			// private (keine Vererbung möglich)
	protected Integer zehen = 10;		// protected (Freigabe der 10)
	
	public Integer getZehen() {
		return this.zehen;
	}
	
	
	

}
