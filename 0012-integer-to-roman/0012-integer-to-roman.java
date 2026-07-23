class Solution {
    public String intToRoman(int num) {
        String rom = "";
        while(num != 0){
            if(num >= 1000){
                num = num - 1000;
                rom = rom.concat("M");
                continue;
            }
            if(num >= 500){
                if(num >= 900){
                num = num - 900;
                rom = rom.concat("CM");
                continue;
                 }
                num = num - 500;
                rom = rom.concat("D");
                continue;
            }
            if(num >= 100){
                if(num >= 400){
                num = num - 400;
                rom = rom.concat("CD");
                continue;
                }
                num = num - 100;
                rom = rom.concat("C");
                continue;
            }
            if(num >= 50){
                if(num >= 90){
                num = num - 90;
                rom = rom.concat("XC");
                continue;
                }
                num = num - 50;
                rom = rom.concat("L");
                continue;
            }
            if(num >= 10){
                if(num >= 40){
                num = num - 40;
                rom = rom.concat("XL");
                continue;
                }
                num = num - 10;
                rom = rom.concat("X");
                continue;
            }

            if(num >= 5){
                if(num >= 9){
                num = num - 9;
                rom = rom.concat("IX");
                continue;
              }
                num = num - 5;
                rom = rom.concat("V");
                continue;
            }
            if(num >= 1){
                if(num >= 4){
                num = num - 4;
                rom = rom.concat("IV");
                continue;
            }
                num = num - 1;
                rom = rom.concat("I");
                continue;
            }
            
        }

        return rom;
        
    }
}