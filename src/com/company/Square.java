package com.company;

public class Square {

    public static void main(String[] args) {
        //Calculation Square A parameters:
        int squareLength1 = 4;
        int squareArea1 = squareLength1 * squareLength1;
        int perimeter1 = squareLength1 * 4;
        boolean vid = squareArea1 == perimeter1;

        String str1 = "SquareA res:";
        String str2 = "Perimeter equals square area:";

        System.out.println(str1 + squareArea1 + "," + perimeter1 + ";" + str2 + vid);

        //Calculation Square B parameters:
        int squareLength2 = 2;
        int squareArea2 = squareLength2 * squareLength2;
        int perimeter2 = squareLength2 * 4;
        boolean vid2 = squareArea2 == perimeter2;

        String str3 = "SquareB res:";
        String str4 = "Perimeter equals square area:";

        System.out.println(str3 + squareArea2 + "," + perimeter2 + ";" + str4 + vid2);
    }


}
