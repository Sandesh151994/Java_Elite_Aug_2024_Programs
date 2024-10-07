package penta.java.oops;

abstract class ImageFile
{
	abstract void fileType();
}

class JPEGFile extends ImageFile
{

	@Override
	void fileType() {
		
		System.out.println("Flat Image File");	
	}
	
}
class PNGFile extends ImageFile
{

	@Override
	void fileType() {
		
		System.out.println("Layered Image File");	
	}
	
}

class PhotoShop{
	
	void open(ImageFile file)
	{
		if(!(file==null))
		{
			if(file instanceof JPEGFile)
			{
				file.fileType();
			}
			else
				if(file instanceof PNGFile)
				{
					file.fileType();
				}
		}
		
	}
}
public class Studio {

	public static void main(String[] args) {
		
		JPEGFile jpeg=new JPEGFile();
		
		PNGFile png=new PNGFile();
		
		PhotoShop ps=new PhotoShop();
		ps.open(png);

	}

}
