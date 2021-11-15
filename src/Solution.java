
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// ENUNCIADO:

// Gràfic coronavirus:

/* Tot seguit s'imprimeixen els casos diaris de coronavirus dels últims dies al nostre barri, la sucessió de dies s'acaba amb un -1. Genera un gràfic que resumeixi la gravetat de cada dia.

Molt greu(MG): igual o més de 200 casos
Greu(GR): entre 150 i 199 casos
Normal(NO): entre 100 i 149
Lleu(LL): Entre 50 i 99 casos
Molt lleu(ML): fins a 49 casos
La gràfica mostrarà un caracter coixinet '#' per cada dia que ha tret un cert nombre de casos.

Exemple:

MG: #######
GR: #########
NO: #####
LL: ###
ML: #
Input Format

Una seqüència de nombres enters.

Cada nombre són el nombre de casos d'un dia qualsevol.

La seqüència acaba amb un -1.

Constraints

No n'hi ha.

Output Format

La gràfica amb el resum de casos, amb el format indicat.

Sample Input 0

160 250 165 134 99 80 40 25 -1
Sample Output 0

MG: #
GR: ##
NO: #
LL: ##
ML: ##

 */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String MG = "MG: ";
        String GR = "GR: ";
        String NO = "NO: ";
        String LL = "LL: ";
        String ML = "ML: ";


        while (num2 != -1)
        {
            if (num1 >=200)
            {
                MG = MG + "#";
            }
            if(num1 >= 150 && num1 <=199)
            {
                GR = GR + "#";
            }
            if (num1 >= 100 && num1 <=149)
            {
                NO = NO + "#";
            }
            if(num1 >= 50 && num1 <= 99)
            {
                LL = LL + "#";
            }
            if (num1 <= 49)
            {
                ML = ML + "#";
            }

            num1 = num2;
            num2 = sc.nextInt();
        }

        if ( num1 >= 200)
        {
            MG = MG +"#";
        }
        if (num1 >= 150 && num1 <= 199)
        {
            GR = GR + "#";
        }
        if (num1 >= 100 && num1 <= 149)
        {
            NO = NO + "#";
        }
        if(num1 >= 50 && num1 <= 99)
        {
            LL = LL + "#";
        }
        if (num1 <= 49)
        {
            ML = ML + "#";
        }

        System.out.println(MG);
        System.out.println(GR);
        System.out.println(NO);
        System.out.println(LL);
        System.out.println(ML);

    }
}
