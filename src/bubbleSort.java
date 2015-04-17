import java.math.BigDecimal;
import java.util.ArrayList;


public class bubbleSort {
	public ArrayList sort(ArrayList<Number> array){
		for (Number num: array){
			int counter = 0;
			for (Number numero: array){
				counter++;
				if (numero.doubleValue() > array.get(counter).doubleValue()){
					//if the first number is larger than the second one
					Number temp = numero;//save first number
					array.set(counter - 1, array.get(counter));//set second number in first num. position
					array.set(counter,temp);//set original firt number in second position 
				}
			}
		}
		return array;
	}
	public static void main(String[] args){
		bubbleSort mySort = new bubbleSort();
		ArrayList<Number> myList= new ArrayList<Number>();
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
