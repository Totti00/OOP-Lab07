package it.unibo.oop.lab.nesting2;

import java.util.*;


public class OneListAcceptable<T> implements Acceptable<T> {

	private final List<T> l1 ;
	
	public OneListAcceptable(final List<T> list) {
		this.l1 = list;
	}
	/**
     * Return the acceptor, i.e. the object which will take a sequence of
     * elements in the very same order as defined on acceptable.
     * 
     * @return the acceptor
     */
	public Acceptor<T> acceptor() {
		final Iterator<T> it = l1.iterator();
		return new Acceptor<T>() {

			public void accept(T newElement) throws ElementNotAcceptedException {
			
				try {
					
					if(newElement.equals(it.next())) {
						return;
					}
					
				}catch(Exception e) {
					System.out.println("Non ci sono piu elementi da confrontare");
				}
				throw new Acceptor.ElementNotAcceptedException(newElement);
				
			}

			public void end() throws EndNotAcceptedException {
				
				try {
					
					if(!it.hasNext()) {
						
						return;
					}
					
				}catch(Exception e) {
					
					System.out.println(e.getMessage());
				}
				throw new Acceptor.EndNotAcceptedException();
			}
			
		};
	}
}
