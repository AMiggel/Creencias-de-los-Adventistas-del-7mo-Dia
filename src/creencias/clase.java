package creencias;

public class clase {

    String[] vector = new String[28];
    int[] num = new int[28];

    String creencias(int i) {

        vector[0] = "Creencia 1: La Palabra de Dios";
        vector[1] = "Creencia 2: La Deidad";
        vector[2] = "Creencia 3: Dios el Padre";
        vector[3] = "Creencia 4: Dios el Hijo";
        vector[4] = "Creencia 5: Dios el Espíritu Santo";
        vector[5] = "Creencia 6: La creación";
        vector[6] = "Creencia 7: La naturaleza humana";
        vector[7] = "Creencia 8: El gran conflicto";
        vector[8] = "Creencia 9: La vida, muerte y resurrección de Cristo";
        vector[9] = "Creencia 10: La experiencia de la salvación";
        vector[10] = "Creencia 11: Crecer en Cristo";
        vector[11] = "Creencia 12: La iglesia";
        vector[12] = "Creencia 13: El remanente y su misión";
        vector[13] = "Creencia 14: La unidad en el cuerpo de Cristo";
        vector[14] = "Creencia 15: El bautismo";
        vector[15] = "Creencia 16: La Cena del Señor";
        vector[16] = "Creencia 17: Los dones y ministerios espirituales";
        vector[17] = "Creencia 18: El don de profecía";
        vector[18] = "Creencia 19: La ley de Dios";
        vector[19] = "Creencia 20: E sábado";
        vector[20] = "Creencia 21: La mayordomía";
        vector[21] = "Creencia 22: La conducta cristiana";
        vector[22] = "Creencia 23: El matrimonio y la familia";
        vector[23] = "Creencia 24: El ministerio de Cristo en el Santuario celestial";
        vector[24] = "Creencia 25: La segunda venida de Cristo";
        vector[25] = "Creencia 26: La muerte y resurrección(humanidad)";
        vector[26] = "Creencia 27: El milenio y el fin del pecado";
        vector[27] = "Creencia 28: La Tierra Nueva";

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        num[5] = 6;
        num[6] = 7;
        num[7] = 8;
        num[8] = 9;
        num[9] = 10;
        num[10] = 11;
        num[11] = 12;
        num[12] = 13;
        num[13] = 14;
        num[14] = 15;
        num[15] = 16;
        num[16] = 17;
        num[17] = 18;
        num[18] = 19;
        num[19] = 20;
        num[20] = 21;
        num[21] = 22;
        num[22] = 23;
        num[23] = 24;
        num[24] = 25;
        num[25] = 26;
        num[26] = 27;
        num[27] = 28;

        for (int j = 0; j < 27; j++) {
            for (int k = i + 1; k < 28; k++) {
                if (num[j] > num[k]) {
                    String temp;
                    temp = vector[j];
                    vector[j] = vector[k];
                    vector[k] = temp;

                    int tem;
                    tem = num[j];
                    num[j] = num[k];
                    num[k] = tem;
                }
            }
        }
        return vector[i];
    }

    public String creenciasd(int i) {
        for (int j = 0; j < 27; j++) {
            for (int k = 1; k < 28; k++) {
                int x;
                x = num[k];
                if (num[j] > x) {
                    String temp;
                    temp = vector[j];
                    vector[j] = vector[k];
                    vector[k] = temp;

                    int tem;
                    tem = num[j];
                    num[j] = num[k];
                    num[k] = tem;
                }
            }
        }
        return vector[i];
    }
}
