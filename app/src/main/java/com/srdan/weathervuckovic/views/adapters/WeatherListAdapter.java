package com.srdan.weathervuckovic.views.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.srdan.weathervuckovic.R;
import com.srdan.weathervuckovic.models.weather.DailyWeather;

import java.util.List;

public class WeatherListAdapter extends ArrayAdapter<DailyWeather> {

    public Activity activity;
    public List<DailyWeather> dailyWeathers;

    public WeatherListAdapter(Activity activity, List<DailyWeather> dailyWeathers) {
        super(activity, R.layout.weather_row, dailyWeathers);
        this.activity = activity;
        this.dailyWeathers = dailyWeathers;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DailyWeather daily = dailyWeathers.get(position);

        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.weather_row, parent, false);

            viewHolder.dayName = convertView.findViewById(R.id.day_name);
            viewHolder.dayMax = convertView.findViewById(R.id.day_max);
            viewHolder.dayMin = convertView.findViewById(R.id.day_min);
            viewHolder.dayDescription = convertView.findViewById(R.id.day_description);

            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.dayName.setText(daily.getDayLabel());
        viewHolder.dayDescription.setText(daily.getDescription());
        viewHolder.dayMax.setText(Float.toString(daily.getDailyMaximalTemp()) + "°C");
        viewHolder.dayMin.setText(Float.toString(daily.getDailyMinimalTemp()) + "°C");

        return convertView;
    }

    private static class ViewHolder {
        TextView dayName;
        TextView dayMax;
        TextView dayMin;
        TextView dayDescription;
    }


}
