
public class Utilizator implements InterfataAntrenament{

	private float kilograme;
	private float inaltime;
	
	public Utilizator(float kilograme, float inaltime) {
		
		this.kilograme = kilograme;
		this.inaltime = inaltime;
	}

	@Override
	public int getNumarExectitii() {
		
		if (this.kilograme > 85.0f && this.inaltime < 1.75f)
			return 25;
		
		return 15;
	}
}
