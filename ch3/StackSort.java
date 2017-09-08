public class StackSort{
	
<<<<<<< HEAD
	//sort method
=======

>>>>>>> cd5072b165b03029d239f1c3273244ba140e9fa6
	public void sort(Stack<Integer> s){

		Stack<Integer> r = new Stack();
		while(!s.isEmpty()){
			int tmp = s.pop();
			while(!r.isEmpty() && r.peek()>tmp){
				s.push(r.pop());
			}
			r.push(tmp);
		}

		while(!r.isEmpty()){
			s.push(r.pop());
		}

	}

<<<<<<< HEAD
}
=======
}
>>>>>>> cd5072b165b03029d239f1c3273244ba140e9fa6
