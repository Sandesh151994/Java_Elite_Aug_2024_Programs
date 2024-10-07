package penta.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Song 
{
	String song_name;
	String movie_name;
	int most_viewed;
	Song(String song_name, String movie_name, int most_viewed) {

		this.song_name = song_name;
		this.movie_name = movie_name;
		this.most_viewed = most_viewed;
	}
	@Override
	public String toString() {
		return "Song [song_name=" + song_name + ", movie_name=" + movie_name + ", most_viewed=" + most_viewed + "]\n";
	}
}
class SongNameComparator implements Comparator<Song>
{

	@Override
	public int compare(Song s1, Song s2) {
		
		return s1.song_name.compareTo(s2.song_name);
	}
	
}
class MostViewedComparator implements Comparator<Song>
{

	@Override
	public int compare(Song s1, Song s2) {
		
		return s1.most_viewed-s2.most_viewed;
	}
	
}
public class ComparableTest {

	public static void main(String[] args) {

		Song song1=new Song("Anisutide","Mungaru Male",2000000);
		Song song2=new Song("Kaho na kao","Murder",3000000);
		Song song3=new Song("Tum hi ho","Ashique-2",5000000);
		Song song4=new Song("PudhuvellaiMazhai","Roja",4000000);
		Song song5=new Song("Manasilayo","Vettayan",1500000);
		Song song6=new Song("Kanaso Idu","Cheluvina Chittara",1000000);
		Song song7=new Song("Hymn for the weekend","Coldplay",7000000);

		ArrayList<Song> songs=new ArrayList<>();

		Collections.addAll(songs, song1,song2,song3,song4,song5,song6,song7);

		SongNameComparator comp=new SongNameComparator();
		Collections.sort(songs, comp);
		System.out.println(songs);
		
		MostViewedComparator viewsort=new MostViewedComparator();
		
		System.out.println();
		System.out.println("Based On View");
		Collections.sort(songs,viewsort);
		System.out.println(songs);


	}

}
