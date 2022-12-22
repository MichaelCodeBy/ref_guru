package refactoring_guru.cc_iterator.example.social_networks;

import refactoring_guru.cc_iterator.example.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
