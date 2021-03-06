//package pl.music_portal.spotify;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.springframework.stereotype.Service;
//import pl.security.SecurityContextService;
//import pl.user.User;
//import pl.music_portal.spotify.POJO.Item;
//import pl.music_portal.spotify.POJO.Spotify;
////import pl.music_portal.spotify.POJO.SpotifyRepository;
//import pl.user.ProfileService;
//import pl.user.UserService;
//import pl.util.HttpClient;
//
//import java.io.IOException;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@Service
//public class SpotifyDataService {
////    private final SpotifyRepository spotifyRepository;
//    private final ProfileService profileService;
//    private final HttpClient httpClient;
//    private final SecurityContextService securityContextService;
//
//    public SpotifyDataService(ProfileService profileService, HttpClient httpClient, SecurityContextService securityContextService) {
////    public SpotifyDataService(SpotifyRepository spotifyRepository, ProfileService profileService, HttpClient httpClient, SecurityContextService securityContextService) {
////        this.spotifyRepository = spotifyRepository;
//        this.profileService = profileService;
//        this.securityContextService = securityContextService;
//        this.httpClient = httpClient;
//    }
//
////    public List<Item> getItems() {
////        User user = securityContextService.getLoggedUser();
////        Spotify spotifyData = spotifyRepository.findByUserUserId(user.getUserId());
////        List<Item> items = spotifyData.getItems();
////        return items;
////    }
//
//    public List<String> getArtists(List<Item> items) {
//        List<String> artistsId = new LinkedList<>();
//
//        items.forEach(item -> {
//            artistsId.add(item.getArtists().get(0).getId());
//        });
//
//        return artistsId;
//    }
//
//    public String getArtistsJson(List<String> artistsId) throws IOException {
//        String userAccessToken = profileService.getSpotifyAccessToken();
//        String artistsIdList = artistsId.stream().collect(Collectors.joining(","));
//        String url = "https://api.spotify.com/v1/artists?ids=" + artistsIdList;
//
//        Map<String, String> headers = httpClient.setAuthHeader(userAccessToken);
//        String response = httpClient.get(url, headers, 5000, 5000);
//
//        return response;
//    }
//
//
////    public List<String> getFavoriteMusicGenres() throws IOException {
////        List<Item> items = getItems();
////        List<String> artistsList = getArtists(items);
////        String artistsJson = getArtistsJson(artistsList);
////
////        JSONObject js = new JSONObject(artistsJson);
////        JSONArray artists = js.getJSONArray("artists");
////        List<String> genresList = new LinkedList<>();
////
////        for (int i = 0; i < artists.length(); i++) {
////            JSONArray genres = artists.getJSONObject(i).getJSONArray("genres");
////            genres.forEach(genre -> genresList.add(genre.toString()));
////        }
////
////        return genresList;
////    } //enum?
//
//}
