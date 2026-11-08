package org2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    static void main() {
        List<Artist> artists = new ArrayList<>();
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        a2.add(2);
        a2.add(6);
        List<Integer> a3 = new ArrayList<>();
        a3.add(1);
        artists.add(new Artist(0, "Zinger", "репчик", 9, a1));
        artists.add(new Artist(1, "Jump cat", "инди-поп", 4, a2));
        artists.add(new Artist(2, "Мс Стильный", "пост-панк", 2, a3));
        artists.add(new Artist(3, "Афиф", "рок", 8, null));
        artists.add(new Artist(4, "Абиф", "рок", 8, null));

        printAllArtists(artists);

        Iterator<Artist> iterator = artists.iterator();
        while (iterator.hasNext()) {
            Artist a = iterator.next();
            if (a.getAverageRating() < 3) {
                iterator.remove();
            }
        }
        System.out.println("После удаления: ");
        printAllArtists(artists);

        for (Artist a : artists) {
            if (a.getAverageRating() >= 4) {
                a.setRank(a.getRank() + 1);
            }
        }
        System.out.println("После повышения ранга: ");
        printAllArtists(artists);

        System.out.println("Артисты с рангом 4");
        printArtists(artists, 4);

        System.out.println("Отсортированный список");
        Collections.sort(artists);
        printAllArtists(artists);
    }

    public static void printAllArtists(List<Artist> artists) {
        for (Artist a : artists) {
            System.out.println("ID: " + a.getId() + ", имя: " + a.getName() + ", средний рейтинг: " + a.getAverageRating());
        }
    }

    public static void printArtists(List<Artist> artists, int rank) {
        for (Artist a : artists) {
            if (a.getRank() == rank) {
                System.out.println("Имя: " + a.getName() + ", Ранг: " + a.getRank());
            }
        }
    }
}


