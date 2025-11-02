package com.example.a30daysofself_care.data

import com.example.a30daysofself_care.R
import com.example.a30daysofself_care.model.SelfCareDay

class Datasource {
    fun loadSelfCareDays(): List<SelfCareDay> {
        return listOf(
            SelfCareDay(R.string.day1_title, R.string.day1_description, R.drawable.day1_go_out_alone),
            SelfCareDay(R.string.day2_title, R.string.day2_description, R.drawable.day2_buy_for_yourself),
            SelfCareDay(R.string.day3_title, R.string.day3_description, R.drawable.day3_read_book),
            SelfCareDay(R.string.day4_title, R.string.day4_description, R.drawable.day4_skin_care),
            SelfCareDay(R.string.day5_title, R.string.day5_description, R.drawable.day5_drink_water),
            SelfCareDay(R.string.day6_title, R.string.day6_description, R.drawable.day6_say_no),
            SelfCareDay(R.string.day7_title, R.string.day7_description, R.drawable.day7_candle_breathe),
            SelfCareDay(R.string.day8_title, R.string.day8_description, R.drawable.day8_three_good_things),
            SelfCareDay(R.string.day9_title, R.string.day9_description, R.drawable.day9_wear_pretty),
            SelfCareDay(R.string.day10_title, R.string.day10_description, R.drawable.day10_me_time_ritual),
            SelfCareDay(R.string.day11_title, R.string.day11_description, R.drawable.day11_mirror_compliment),
            SelfCareDay(R.string.day12_title, R.string.day12_description, R.drawable.day12_no_screen_meal),
            SelfCareDay(R.string.day13_title, R.string.day13_description, R.drawable.day13_stretch),
            SelfCareDay(R.string.day14_title, R.string.day14_description, R.drawable.day14_call_uplifting_friend),
            SelfCareDay(R.string.day15_title, R.string.day15_description, R.drawable.day15_declutter),
            SelfCareDay(R.string.day16_title, R.string.day16_description, R.drawable.day16_healing_song),
            SelfCareDay(R.string.day17_title, R.string.day17_description, R.drawable.day17_eight_hours_sleep),
            SelfCareDay(R.string.day18_title, R.string.day18_description, R.drawable.day18_favorite_meal),
            SelfCareDay(R.string.day19_title, R.string.day19_description, R.drawable.day19_sit_outside),
            SelfCareDay(R.string.day20_title, R.string.day20_description, R.drawable.day20_letter_future_self),
            SelfCareDay(R.string.day21_title, R.string.day21_description, R.drawable.day21_digital_detox),
            SelfCareDay(R.string.day22_title, R.string.day22_description, R.drawable.day22_practice_gratitude),
            SelfCareDay(R.string.day23_title, R.string.day23_description, R.drawable.day23_new_skincare),
            SelfCareDay(R.string.day24_title, R.string.day24_description, R.drawable.day24_love_note_self),
            SelfCareDay(R.string.day25_title, R.string.day25_description, R.drawable.day25_fresh_flowers),
            SelfCareDay(R.string.day26_title, R.string.day26_description, R.drawable.day26_journal_feelings),
            SelfCareDay(R.string.day27_title, R.string.day27_description, R.drawable.day27_photo_beauty),
            SelfCareDay(R.string.day28_title, R.string.day28_description, R.drawable.day28_forgive_yourself),
            SelfCareDay(R.string.day29_title, R.string.day29_description, R.drawable.day29_tiny_brave_act),
            SelfCareDay(R.string.day30_title, R.string.day30_description, R.drawable.day30_celebrate_yourself)
        )
    }
}