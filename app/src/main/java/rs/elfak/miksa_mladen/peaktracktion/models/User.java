package rs.elfak.miksa_mladen.peaktracktion.models;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import rs.elfak.miksa_mladen.peaktracktion.utils.Coordinates;

public class User {
  public String userId;
  public String fullName;
  public String displayName;
  public String email;
  public String phone;
  public Coordinates location = new Coordinates(0, 0);
  public int points = 0;
  public String imgUrl = "https://unsplash.it/200/?random";
  public Map<String, Boolean> createdPlaces = new HashMap<>();
  public Map<String, Boolean> visitedPlaces = new HashMap<>();
  public Map<String, Boolean> favoritePlaces = new HashMap<>();
  public Map<String, Boolean> friends = new HashMap<>();

  public User() {
    // for .class()
  }

  public User(String fullName) {
    this.fullName = fullName;
    this.email = fullName + "@friend.com";
  }

  public User(String id, String fullName, String displayName, String email, String phone, String imageUrl) {
    this.userId = id;
    this.fullName = fullName;
    this.displayName = displayName;
    this.email = email;
    this.phone = phone;
    this.imgUrl = imageUrl;
  }
}
