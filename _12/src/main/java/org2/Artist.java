package org2;

import java.util.ArrayList;
import java.util.List;

public class Artist implements Comparable<Artist>{
    private int id;
    private String name;
    private String genre;
    private int rank;
    private List<Integer> fanRatings;

    public Artist(int id, String name, String genre, int rank, List<Integer> fanRatings) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.rank = rank;
        if (fanRatings != null) {
            this.fanRatings = fanRatings;
        } else {
            this.fanRatings = new ArrayList<>();
        }
    }
    public String getName(){return name;}
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getId() { return id;
    }
    public int getAverageRating() {
        if (fanRatings == null || fanRatings.isEmpty()) {
            return rank;
        }
        int sum = rank;
        for (Integer rating : fanRatings) {
            sum += rating;
        }
        return sum / (fanRatings.size() + 1);
    }

    @Override
    public int compareTo(Artist other) {
        int cmp = Double.compare(other.getAverageRating(), this.getAverageRating());
        if (cmp != 0) {
            return cmp;
        }
        return this.getName().compareTo(other.getName());
    }


}
