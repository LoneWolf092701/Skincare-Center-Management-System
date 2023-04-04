package Part03;

import Part03.Stock;

public class waitingsss {
    public waitingsss(){
        int empty_count1 = 0;
        int empty_count2 = 0;
        int empty_count3 = 0;

        for(int i = 0; i < 6; i++){
            if(Stock.Queue01[i] == "EMPTY"){
                empty_count1 ++;
            }
            if(Stock.Queue02[i] == "EMPTY"){
                empty_count2 ++;
            }
            if(Stock.Queue03[i] == "EMPTY"){
                empty_count3 ++;
            }
        }
        System.out.println(empty_count1 + "," + empty_count2 + ","+ empty_count3);

//        if((Stock.Queue01[0] == "EMPTY") && (Stock.Queue01[1] == "EMPTY") && (Stock.Queue01[2] == "EMPTY") && (Stock.Queue01[3] == "EMPTY") && (Stock.Queue01[4] == "EMPTY") && (Stock.Queue01[5] == "EMPTY")){
//                System.out.println("1");
//
//        }else if ((Stock.Queue02[0] == "EMPTY") && (Stock.Queue02[1] == "EMPTY") && (Stock.Queue02[2] == "EMPTY") && (Stock.Queue02[3] == "EMPTY") && (Stock.Queue02[4] == "EMPTY") && (Stock.Queue02[5] == "EMPTY")){
//            System.out.println("2");
//
//        }else if ((Stock.Queue03[0] == "EMPTY") && (Stock.Queue03[1] == "EMPTY") && (Stock.Queue03[2] == "EMPTY") && (Stock.Queue03[3] == "EMPTY") && (Stock.Queue03[4] == "EMPTY") && (Stock.Queue03[5] == "EMPTY")){
//            System.out.println("3");
//
//        }else if ((Stock.Queue04[0] == "EMPTY") && (Stock.Queue04[1] == "EMPTY") && (Stock.Queue04[2] == "EMPTY") && (Stock.Queue04[3] == "EMPTY") && (Stock.Queue04[4] == "EMPTY") && (Stock.Queue04[5] == "EMPTY")){
//            System.out.println("4");
//
//        }else if ((Stock.Queue05[0] == "EMPTY") && (Stock.Queue05[1] == "EMPTY") && (Stock.Queue05[2] == "EMPTY") && (Stock.Queue05[3] == "EMPTY") && (Stock.Queue05[4] == "EMPTY") && (Stock.Queue05[5] == "EMPTY")){
//            System.out.println("5");

        //}else if ((Stock.Queue01[0] == "EMPTY") && (Stock.Queue01[1] == "EMPTY") && (Stock.Queue01[2] == "EMPTY") && (Stock.Queue01[3] == "EMPTY") && (Stock.Queue01[4] == "EMPTY") && (Stock.Queue01[5] == "EMPTY")){

        //}
    }
}
