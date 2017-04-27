package design_pattern.factoryAbstract.before;

public class HyundaiMotor extends Motor {

	@Override
	protected void moveMotor(Direction direction) {
		String strDirection = direction == Direction.UP?"위로":"아래로";
		System.out.printf("Hyundai 모터 %s 이동 중...", strDirection);		
		
	}
	
}
