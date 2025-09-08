package org.example.LowLevelDesignSystemExample.DesignLinkedin.src.strategy;

import org.example.LowLevelDesignSystemExample.DesignLinkedin.src.entities.Post;

import java.util.List;

public interface FeedSortingStrategy {
    List<Post> sort(List<Post> posts);
}
