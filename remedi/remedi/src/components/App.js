import logo from "../logo.svg";
import "./App.css";

import Header from "./Header";
import Footer from "./Footer";
import AppContent from "./AppContent";

function App() {
  return (
    <div className="App">
      <Header pageTitle="Frontend authenticated with JWT" logoSrc={logo} />
      <div className="container-fluid">
        <div className="row">
          <div className="col">
            <AppContent />
          </div>
        </div>
      </div>
      <Footer />
    </div>
  );
}

export default App;
