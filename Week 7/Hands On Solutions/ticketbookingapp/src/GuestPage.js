import React from "react";
import FlightList from "./FlightList";

function GuestPage() {
  return (
    <div>
      <h2>Welcome Guest!</h2>
      <p>You can browse available flights, but login to book.</p>
      <FlightList showBooking={false} />
    </div>
  );
}

export default GuestPage;
