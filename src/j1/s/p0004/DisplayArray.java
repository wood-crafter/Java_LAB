/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0004;

/**
 *
 * @author phanh
 */
public class DisplayArray {
    public void original(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public void sorted(int[] arr, int firstIndex, int lastIndex){
        int sliceLength = lastIndex - firstIndex + 1;
        if(sliceLength > 3){
            
            
            if(arr[firstIndex] >= arr[lastIndex - (sliceLength / 2)] && arr[firstIndex + 1] <= arr[lastIndex]){
                int temp = arr[firstIndex];
                arr[firstIndex] = arr[firstIndex + 1];
                arr[firstIndex + 1] = temp;
            } else if(arr[firstIndex] <= arr[firstIndex + 1] && arr[firstIndex + 1] >= arr[lastIndex]){
                int temp = arr[firstIndex + 1];
                arr[firstIndex + 1] = arr[lastIndex];
                arr[lastIndex] = temp;
            } else if(arr[firstIndex] >= arr[firstIndex + 1] && arr[firstIndex + 1] >= arr[lastIndex]){
                int temp = arr[firstIndex];
                arr[firstIndex] = arr[lastIndex];
                arr[firstIndex] = temp;
            }
            
        } else if(sliceLength == 3){
            if(arr[firstIndex] >= arr[firstIndex + 1] && arr[firstIndex + 1] <= arr[lastIndex]){
                int temp = arr[firstIndex];
                arr[firstIndex] = arr[firstIndex + 1];
                arr[firstIndex + 1] = temp;
            } else if(arr[firstIndex] <= arr[firstIndex + 1] && arr[firstIndex + 1] >= arr[lastIndex]){
                int temp = arr[firstIndex + 1];
                arr[firstIndex + 1] = arr[lastIndex];
                arr[lastIndex] = temp;
            } else if(arr[firstIndex] >= arr[firstIndex + 1] && arr[firstIndex + 1] >= arr[lastIndex]){
                int temp = arr[firstIndex];
                arr[firstIndex] = arr[lastIndex];
                arr[firstIndex] = temp;
            }
        } else if(sliceLength == 2){
            if(arr[firstIndex] > arr[lastIndex]){
                int temp = arr[firstIndex];
                arr[firstIndex] = arr[lastIndex];
                arr[firstIndex] = temp;
            }
        }
        
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
