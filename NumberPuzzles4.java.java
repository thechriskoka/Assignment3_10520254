/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_10513947;

/**
 *
 * @author Edwin Etornam
 */
public class NumberPuzzles4 {
    public static void main(String[] args) {
        boolean ans1=false;
        boolean ans2=false;
        for(int i=1; i<45; i++){
            for(int j=0; j<45; j++){
                for(int z=0; z<45; z++){
                    for(int y=0; y<45; y++){
                        //if((i+j+z+y)==45)
                          ans1=(j*2)==(i/2);
                          ans2=(z+2)==(y-2);
                          if(ans1 && ans2 )
                            System.out.println(i+"\t"+j+"\t"+z+"\t"+y);
                    }
                }
            }
        }
    }
    
}
