<script>
    // Facebook sign-in function
    function signInWithFacebook() {
      // Replace "YOUR_FACEBOOK_APP_ID" with your actual Facebook App ID
      // and specify your desired permissions scope
      var facebookLoginUrl = "https://www.facebook.com/v13.0/dialog/oauth?client_id=YOUR_FACEBOOK_APP_ID&redirect_uri=YOUR_REDIRECT_URI&scope=email";

      // Redirect the user to the Facebook login URL
      window.location.href = facebookLoginUrl;
    }

    // Google sign-in function
    function signInWithGoogle() {
      // Replace "YOUR_GOOGLE_CLIENT_ID" with your actual Google Client ID
      // and specify desired scopes
      var googleSignInUrl = "https://accounts.google.com/o/oauth2/v2/auth?client_id=YOUR_GOOGLE_CLIENT_ID&redirect_uri=YOUR_REDIRECT_URI&response_type=code&scope=email%20profile";

      // Redirect the user to the Google sign-in URL
      window.location.href = googleSignInUrl;
    }

    // Twitter sign-in function
    function signInWithTwitter() {
      // Replace "YOUR_TWITTER_API_KEY" with your actual Twitter API Key
      // and specify your desired URL
      var twitterSignInUrl = "https://api.twitter.com/oauth/authenticate?client_id=YOUR_TWITTER_API_KEY&redirect_uri=YOUR_CALLBACK_URL";

      // Redirect the user to the Twitter sign-in URL
      window.location.href = twitterSignInUrl;
    }
  </script>
</body>
</html>