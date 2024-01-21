package org.spring.springstarter.sort;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm{


    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
