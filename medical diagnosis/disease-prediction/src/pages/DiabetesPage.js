import React from "react";
import Diabetes from "../components/Diabetes";
import Navbar from "../components/Navbar";

export default function DiabetesPage() {
  return (
    <div className="flex px-20">
      <div className="w-2/12">
        <Navbar />
      </div>
      <div className="w-10/12">
        <Diabetes />
      </div>
    </div>
  );
}
