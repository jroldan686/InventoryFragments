package jrl.deint.inventoryFragments.ui.dependency.presenter;

import jrl.deint.inventoryFragments.data.db.model.Dependency;
import jrl.deint.inventoryFragments.ui.dependency.contract.AddEditDependencyContract;
import jrl.deint.inventoryFragments.ui.dependency.interactor.AddEditDependencyInteractor;
import jrl.deint.inventoryFragments.ui.dependency.interactor.AddEditDependencyInteractorImpl;

/**
 * Created by usuario on 23/11/17.
 */

public class AddEditDependencyPresenter implements AddEditDependencyContract.Presenter,
        AddEditDependencyInteractor.OnAddEditFinishedListener {

    private AddEditDependencyContract.View view;
    private AddEditDependencyInteractorImpl interactor;

    public AddEditDependencyPresenter(AddEditDependencyContract.View view) {
        this.view = view;
        this.interactor = new AddEditDependencyInteractorImpl();
    }

    @Override
    public void saveDependency(String name, String shortname, String description) {
        interactor.validateDependency(name, shortname, description, this);
    }

    @Override
    public void editDependency(Dependency dependency, String description) {
        interactor.editDependency(dependency, description, this);
    }

    @Override
    public void onNameEmptyError() {
        view.showNameEmptyError();
    }


    @Override
    public void onShortNameEmptyError() {
        view.showShortNameEmptyError();
    }


    @Override
    public void onShortNameLengthError() {
        view.showShortNameLengthError();
    }


    @Override
    public void onDescriptionEmptyError() {
        view.showDescriptionEmptyError();
    }


    @Override
    public void onSuccess(String name, String shortname, String description) {
        interactor.addDependency(name, shortname, description);
        view.showListDependency();
    }

    @Override
    public void validatedependency() {

    }

    /**
     * Se llama cuando se destruya la Activity
     */
    @Override
    public void onDestroy() {
        view = null;
        interactor = null;
    }
}
