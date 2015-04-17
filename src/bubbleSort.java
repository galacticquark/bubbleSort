import java.math.BigDecimal;
import java.util.ArrayList;
//AESO 343 POO

public class bubbleSort {
	public ArrayList sort(ArrayList<Number> array){
		for (int i = 0; i< array.size(); i++){
			for (int e = 0; e < array.size(); e++){
				if (array.get(e).doubleValue() > array.get(e + 1).doubleValue()){
					//if the first number is larger than the second one
					Number temp = array.get(e);//save first number
					array.set(e, array.get(e + 1));//set second number in first num. position
					array.set(e + 1,temp);//set original firt number in second position
				}if(e + 2 >= array.size()){break;}
			}
		}
		return array;
	}
	public static void main(String[] args){
		bubbleSort mySort = new bubbleSort();
		ArrayList<Number> myList= new ArrayList<Number>();
		myList.add(10);
		myList.add(9);
		myList.add(12);
		myList.add(1);
		myList.add(10);
		myList.add(0.000001);
		myList.add(10.0);
		myList.add((long)10);
		myList.add((short)1.2);		
		myList.add((float)10);
		myList.add((byte)5);
		System.out.println(mySort.sort(myList));
		
		
		}
}
