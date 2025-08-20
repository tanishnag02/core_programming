public class PenDistribution{
	public static void main(String[] args){
		int pen = 14;
        int numberofStudent = 3;
        int AssignPen = pen/numberofStudent;
        int distributedPen=numberofStudent * AssignPen;
        int remainingPen = pen % numberofStudent;

        System.out.println(distributedPen);
        System.out.println(remainingPen);
	}
}