package app.bo.com.ucb.loginmvp2021

interface IContractLogin {

    interface View {
        fun showError(message: String)
        fun hideForm()
        fun showForm()
        fun navigateTo()
    }

    interface Presenter {
        fun doLogin(userName: String)
    }
}