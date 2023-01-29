import React from "react";
import FacebookIcon from "@mui/icons-material/Facebook";
import TwitterIcon from "@mui/icons-material/Twitter";
import InstagramIcon from "@mui/icons-material/Instagram";
import YouTubeIcon from "@mui/icons-material/YouTube";

import {
  MDBFooter,
  MDBContainer,
  MDBRow,
  MDBCol,
  MDBIcon,
} from "mdb-react-ui-kit";

const Footer = () => {
  return (
    <MDBFooter
      bgColor="light"
      className="text-center text-lg-start text-muted bg-green-800"
    >
      <section className="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
        <div className="me-5 d-none d-lg-block">
          <span>Get connected with us on social networks:</span>
        </div>

        <div>
          <a href="" className="me-4 text-reset p-2">
            <FacebookIcon />
          </a>
          <a href="" className="me-4 text-reset p-2">
            <TwitterIcon />
          </a>
          <a href="" className="me-4 text-reset p-2">
            <InstagramIcon />
          </a>
          <a href="" className="me-4 text-reset p-2">
            <YouTubeIcon />
          </a>
        </div>
      </section>

      <div className="flex-auto content-center">
        <a href="/mission_statement">
          <p>Mission Statement</p>
        </a>
        <p>About Us</p>
        <p>Contact Us</p>
      </div>

      <div className="text-center p-4 bg-green-800">
        © 2021 Copyright:
        <a className="text-reset fw-bold" href="https://mdbootstrap.com/">
          MDBootstrap.com
        </a>
      </div>
    </MDBFooter>
  );
};

export default Footer;
