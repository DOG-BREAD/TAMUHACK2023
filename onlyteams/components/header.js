import React from "react";
import logo from "/Users/ibadmomin/Desktop/TAMUHACK/onlyteams/public/CBRE_Group-Logo.wine.svg";

const Header = () => {
  return (
    <div className="header bg-green-100 h-28">
      {/* <img src={logo} alt="CBRE" className="h-20 w-20 ml-4 mt-2" /> */}
      <h1 className="text-center text-green-900 text-5xl pt-2 font-mono">
        OnlyTeams
      </h1>
    </div>
  );
};

export default Header;
