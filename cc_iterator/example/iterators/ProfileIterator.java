package refactoring_guru.cc_iterator.example.iterators;

import refactoring_guru.cc_iterator.example.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}