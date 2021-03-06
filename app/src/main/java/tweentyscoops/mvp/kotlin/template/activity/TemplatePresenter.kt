package tweentyscoops.mvp.kotlin.template.activity

import tweentyscoops.mvp.kotlin.ui.base.BasePresenter
import javax.inject.Inject

class TemplatePresenter @Inject constructor() : BasePresenter<TemplateContract.View>(),
        TemplateContract.Presenter {

    override fun onViewStart() {
        super.onViewStart()
    }

    override fun onViewStop() {
        super.onViewStop()
    }
}