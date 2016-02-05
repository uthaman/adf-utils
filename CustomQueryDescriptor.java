
import java.io.Serializable;

import java.util.Map;

import oracle.adf.view.rich.model.AttributeCriterion;
import oracle.adf.view.rich.model.ConjunctionCriterion;
import oracle.adf.view.rich.model.FilterableQueryDescriptor;
import oracle.adf.view.rich.model.QueryDescriptor;


public class CustomQueryDescriptor extends FilterableQueryDescriptor implements Serializable {

    Map<String, Object> filterCriteria;
    private Map<String, Object> uiHintMap;
    private ConjunctionCriterion conjunctionCriterion;


    public CustomQueryDescriptor() {
        super();
    }

    @Override
    public Map<String, Object> getFilterCriteria() {
        return filterCriteria;
    }

    @Override
    public void setFilterCriteria(Map<String, Object> filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    @Override
    public void addCriterion(String string) {
    }

    @Override
    public void changeMode(QueryDescriptor.QueryMode queryMode) {
        getUIHints().put(QueryDescriptor.UIHINT_MODE, queryMode);
    }

    @Override
    public ConjunctionCriterion getConjunctionCriterion() {
        return conjunctionCriterion;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Map<String, Object> getUIHints() {
        return uiHintMap;
    }

    @Override
    public void removeCriterion(oracle.adf.view.rich.model.Criterion criterion) {
    }

    @Override
    public AttributeCriterion getCurrentCriterion() {
        return null;
    }

    @Override
    public void setCurrentCriterion(AttributeCriterion attributeCriterion) {
    }
}
