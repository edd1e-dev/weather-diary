package com.zerobase.weather.service;

import com.zerobase.weather.domain.Diary;
import java.time.LocalDate;
import java.util.List;

public interface DiaryService {
    public void saveWeatherDate();
    public List<Diary> readDiary(LocalDate date);
    public List<Diary> readDiaries(LocalDate startDate, LocalDate endDate);
    public void createDiary(LocalDate date, String text);
    public void updateDiary(LocalDate date, String text);
    public void deleteDiary(LocalDate date);
}
