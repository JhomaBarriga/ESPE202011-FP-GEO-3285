/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searching;

/**
 *
 * @author Sony Vaio
 */
public class Binary {
    
    public static  int getBinary(int elements[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (elements[mid] == x) {
                return mid;
            }

            if (elements[mid] > x) {
                return getBinary(elements, left, mid - 1, x);
            }

            return getBinary(elements, mid + 1, right, x);
        }
        return -1;
    }
}

