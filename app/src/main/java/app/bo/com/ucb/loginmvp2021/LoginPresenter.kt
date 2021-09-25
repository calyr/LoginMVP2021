package app.bo.com.ucb.loginmvp2021

class LoginPresenter(val view: IContractLogin.View) : IContractLogin.Presenter {

    override fun doLogin(userName: String) {
        view.hideForm()
        if( userName == "calyr") {
            view.navigateTo()

        } else {
            view.showError("Invalid user")
            view.showForm()
        }


    }
}