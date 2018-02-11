package org.myProj.dpPractice.IteratorPattern;

public class ConcreteIterator implements Aggregate{
	public String names[] = {"A" , "B" ,"C" , "D"};
	@Override
	public Iterator getIterator() {
		return new NameIterator() ;
	}
	
	private class NameIterator implements Iterator{
		int current ;
		
		@Override
		public boolean hasNext() {
			if(current < names.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return names[current++];
			}
			return null;
		}

		@Override
		public int getCount() {
			return current;
		}
		
	}

	
	private class NameIteratorDesc implements Iterator{
		int current =names.length;
		
		@Override
		public boolean hasNext() {
			if(current > 0){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return names[--current];
			}
			return null;
		}

		@Override
		public int getCount() {
			return current;
		}
		
	}

	
}
