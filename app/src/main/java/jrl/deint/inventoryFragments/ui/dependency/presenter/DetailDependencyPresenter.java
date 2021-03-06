package jrl.deint.inventoryFragments.ui.dependency.presenter;

import java.io.Serializable;
import java.util.List;

import jrl.deint.inventoryFragments.data.db.model.Dependency;
import jrl.deint.inventoryFragments.ui.dependency.contract.DetailDependencyContract;
import jrl.deint.inventoryFragments.ui.dependency.interactor.DetailDependencyInteractor;

/**
 * Created by usuario on 23/11/17.
 */

public class DetailDependencyPresenter implements DetailDependencyContract.Presenter, DetailDependencyInteractor.OnLoadFinishedListener, Serializable {

    public static final String TAG = "detaildependencypresenter";
    DetailDependencyContract.View view;

    public DetailDependencyPresenter(DetailDependencyContract.View view) {
        this.view = view;
    }

    @Override
    public void validatedependency() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onSuccess(List<Dependency> dependencies) {

    }
}
