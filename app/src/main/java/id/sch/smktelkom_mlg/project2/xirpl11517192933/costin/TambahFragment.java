package id.sch.smktelkom_mlg.project2.xirpl11517192933.costin;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TambahFragment extends Fragment {

    TextView etTgl;
    int mYear;
    int mMonth;
    int mDay;
    Spinner spJenis;

    public TambahFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tambah_layout, container, false);

        spJenis = (Spinner) v.findViewById(R.id.spinnerJenis);

//        final Calendar myCalendar = Calendar.getInstance();
//
//        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//                myCalendar.set(Calendar.YEAR, year);
//                myCalendar.set(Calendar.MONTH, monthOfYear);
//                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
//                updateLabel();
//            }
//        };
//
//        etTgl.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
//                new DatePickerDialog(TambahFragment.this, date, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
//            }
//        });
//        etTgl.setOnClickListener(new View.OnClickListener() {
//            @RequiresApi(api = Build.VERSION_CODES.N)
//            @Override
//            public void onClick(View view) {
//                Calendar mcurrentDate = Calendar.getInstance();
//                mYear = mcurrentDate.get(Calendar.YEAR);
//                mMonth = mcurrentDate.get(Calendar.MONTH);
//                mDay = mcurrentDate.get(Calendar.DAY_OF_MONTH);
//
//                DatePickerDialog mDatePicker = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
//                    public void onDateSet(DatePicker datePicker, int selectedyear, int selectedmonth, int selectedday) {
//
//                    }
//                }, mYear, mMonth, mDay);
//                mDatePicker.setTitle("Select date");
//                mDatePicker.show();
//            }
//        });

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tambah_layout, container, false);
    }

}
