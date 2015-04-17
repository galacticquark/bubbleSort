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
}
