public class ArrayList <T extends Comparable <? super T>>{
		private int size;
		private int capacity;
		private T[] arr = (T[]) new Comparable[5];
		
		public ArrayList(){
			this.size = 0;
			this.capacity = 5;
		}
	
	 
		public int size() {
			return this.size;
		}

		 
		public boolean isEmpty() {
			return this.size == 0;
		}

		 
		public boolean contains(T val) {
			for(int x = 0; x < this.size; x++){
				return this.arr[x] == val;
			}
			return false;
		}

		public boolean isFull(){
			return this.size == this.capacity;
		}
		 
		/**if we get to the end of the array, and we still want to add, 
		 * we increase the capacity of the array by half its size
		 **/
		public void add(T val) {
			if(this.isFull()){
				T[] newArr = (T[]) new Comparable[(int) (this.capacity * 1.5)];
				//copy the old array into the new one
				for(int i = 0; i < this.capacity; i++){
					newArr[i] = this.arr[i];
				}
				//make the new larger array our new array for the session
				this.arr = newArr;
			}
			//place the new value into the array
			this.arr[this.size] = val;
			this.size++;
		}

		 
		public T remove() {
			this.size--;
			return this.arr[this.size];
		}
		
		 public void clear() {
			this.size = 0;
			
		}

		public T get(int index) {
			return this.arr[index];
		}

		 
		public void set(int index, T element) {
			this.arr[index] = element;
		}

		public int indexOf(T val) {
			int i = 0;
			while(i < this.size){
				if(this.arr[i] == val){
					return i;
				}
				i++;
			}
			return -1;
		}
		
		public void printList(){
			for(int x = 0; x < this.size; x++){
				System.out.println(this.arr[x]);
			}
			//System.out.println("here");
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrList = new ArrayList();
		
		arrList.add(1);arrList.add(2);arrList.add(3);arrList.add(4);arrList.add(5);arrList.add(6);arrList.add(7);
		System.out.println(arrList.indexOf(5));
		//System.out.println(arrList.get(3));
		arrList.printList();

	}

}
